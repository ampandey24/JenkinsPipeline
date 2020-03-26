def pros;
def readpom;
node 
{
    stage('Ceckout SCM'){
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/ampandey24/JenkinsPipeline.git']]])   
        //workspace = pwd()
        
    }
    stage ('Reading Properties File'){
        pros = readProperties file: 'login.properties'
        echo "URL Value: ${pros['URL']}"
    }
    stage ('Reading POM.xml File'){
        readpom = readMavenPom file: '';
        echo "artifactId Value ${readpom.artifactId}"
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
