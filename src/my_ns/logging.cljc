(ns my-ns.logging
  #?(:cljs (:require bunyan))
  #?(:cljs (:require-macros [my-ns.logging])))

#?(:cljs
   (defstate ^{:doc "The system logger"}
     parent-logger
     :start (.createLogger bunyan #js {:name "my-ns" :serializers bunyan/stdSerializers})))

#?(:clj
   (defmacro self-ns-name
     "Return the namespace name as string (at compile time - macro)."
     []
     (str *ns*)))
