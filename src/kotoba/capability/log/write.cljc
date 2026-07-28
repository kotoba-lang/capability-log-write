(ns kotoba.capability.log.write
  "Importable contract for log/write.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:log-write}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid "rad:z4DiGJTFkrNmj8QfHWr4vV9G5EgRC", :capability/repository "kotoba-lang/capability-log-write", :capability/id "log/write", :capability/effects #{:storage-write}, :capability/provider-status :contract-only})
