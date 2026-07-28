(ns kotoba.capability.log.write
  "Importable contract for log/write."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "log/write"))
