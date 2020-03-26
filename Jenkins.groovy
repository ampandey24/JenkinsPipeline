node 
{
    stage('Ceckout SCM'){
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/ampandey24/JenkinsPipeline.git']]])   
        workspace = pwd()
        
    }
    stage ('Build'){
        echo "Build"
    }
    stage ('Test'){
        echo "Test"
    }
    stage ('Deploy'){
        echo "Deploy"
    }
}
