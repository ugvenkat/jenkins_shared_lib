def call(String hubUser, String AppName, String ImageTag ){
    
     sh """
      docker image build -t ${hubUser}/${project} . 
      docker image tag ${hubUser}/${AppName} ${hubUser}/${AppName}:${ImageTag}
      #docker image tag ${hubUser}/${AppName} ${hubUser}/${AppName}:latest
     """
}

/*
def call(String aws_account_id, String region, String ecr_repoName){
    
    sh """
     docker build -t ${ecr_repoName} .
     docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}
*/
