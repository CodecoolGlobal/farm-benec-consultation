(set-env!
 :source-paths #{"src/main/java"}
 :resource-paths #{}
 :dependencies '[[virgil "0.1.9" :scope "test"]])

(require '[virgil.boot :refer [javac*]])

(task-options!
 javac* {:options (let [java-version "11"]
                    ["-Xlint:all"
                     "-Xlint:unchecked"
                     "-Werror"
                     "-source" java-version
                     "-target" java-version])})

(deftask dev
  []
  (comp
   (watch)
   (javac*)))

(comment
  (def p (atom nil))
  (restart p)
  )

(defn restart
  [builder]
  (swap! builder
         (fn [old]
           (when old
             (future-cancel old))
           (future (boot (dev))))))
