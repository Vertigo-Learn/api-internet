# api-internet

## Gerando a imagem da aplicacao

```shell script
./mvnw package

 docker build -f src/main/docker/Dockerfile.jvm -t <docker-hub-user>/api-internet .
 docker push <docker-hub-user>/api-internet

```


## Instalando no Kubernetes

```shell script
kubectl apply -f ./kubernetes/deployment.yaml

```