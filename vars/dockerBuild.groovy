def call(String hubUser, String AppName, String ImageTag ){
    
     sh """
      docker image build -t ${hubUser}/${AppName} . 
      docker image tag ${hubUser}/${AppName} ${hubUser}/${AppName}:${ImageTag}
      #docker image tag ${hubUser}/${AppName} ${hubUser}/${AppName}:latest
     """
}


