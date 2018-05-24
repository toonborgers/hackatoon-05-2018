Repo for the hackatoon @ cegeka on 23-24 May 2018

## Tasks
* Create simple foo microservice ✅
* Push Docker image to google cloud ✅ 
* Deploy instance on k8s ✅
* Create bar microservice ✅
* Push docker image + deploy to k8s ✅
* Make foo service call bar service ✅
* Add circuit breaker for fallback ✅
* Deploy using k8s deployment file ✅


## Set up commandline
1. Install google cloud sdk: [link](https://cloud.google.com/sdk/docs/quickstart-macos)
2. Add k8s support: `gcloud components install kubectl`
3. Point local kubelet to remote cluster: `gcloud container clusters get-credentials <clustername> --zone=<clusterzone>`

## Tag and push image to gcr
1. `docker tag <image> gcr.io/$PROJECT_ID/name:tag`
2. `gcloud docker -- push gcr.io/$PROJECT_ID/name:tag`

## Spinnaker
1. Follow [this guide](https://cloud.google.com/solutions/continuous-delivery-spinnaker-kubernetes-engine) until step 1 of *Deploy the Spinnaker chart*
2. To make spinnaker publicly available, run `kubectl expose deployment cd-spinnaker-deck --name=spinnaker-ui --port=8080 --target-port=9000 --type=LoadBalancer`
 
