(ns athens-backend.env
  (:require
   [taoensso.timbre :as log]
   [ring.middleware.reload :as reload]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[athens-backend started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[athens-backend has shut down successfully]=-"))
   :middleware reload/wrap-reload})
