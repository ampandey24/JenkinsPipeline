def pros;
def pom;
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
        pom = readMavenPom file: 'pom.xml'
        echo "artifactId Value: ${pom.artifactId}"
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
