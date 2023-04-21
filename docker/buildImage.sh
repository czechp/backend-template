cp ../core/target/backend-template.jar .
IMAGE_NAME=czechprz/backend-template
sudo docker image rm -f $IMAGE_NAME
sudo docker image build --tag $IMAGE_NAME .
sudo docker image push $IMAGE_NAME
