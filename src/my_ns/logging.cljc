(ns my-ns.logging
  (:require [util :as node-util]))

;; (def node-util (js/require "util")) ;; this does not work either

(println (node-util/format "testing %s" "this"))
