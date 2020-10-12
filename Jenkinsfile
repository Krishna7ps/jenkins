// pipeline{
//     agent any
    
//     stages{
//         stage('Build')
//         {
//             steps
//             {
//                 sh 'ls'
//             }
//         }
//         stage('Test')
//         {
//             steps
//             {
//                 sh 'pwd'
//             }
//         }
//         stage('Deploy')
//         {
//             steps
//             {
//                 sh 'echo welcome'
//             }

//         }
//     }
// }
// console colors



// #!/usr/bin/env groovy
import groovy.transform.Field

@Field def RESET = '\u001B[0m'
@Field def BLACK_BOLD = '\u001B[46m\u001B[1;30m' // skip stage msg
@Field def RED_BOLD = '\u001B[1;31m' // error msg
@Field def GREEN_BOLD = '\u001B[40m\u001B[1;32m' // stage name msg
@Field def YELLOW_BOLD = '\u001B[1;33m'
@Field def BLUE_BOLD = '\u001B[1;34m'
@Field def CYAN_BOLD = '\u001B[1;36m'
@Field def PURPLE_BOLD = '\u001B[1;35m' // info msg
@Field def WHITE_BOLD = '\u001B[1;37m'


ansiColor('xterm') {
    // properties([parameters([string(defaultValue:"hello", description:"What's happening",name:'Greetings')])])
    node{
        stage('checkout'){
            println "${GREEN_BOLD} STAGE: checkout ${RESET}"
            git branch: 'main', url: 'https://github.com/Krishna7ps/jenkins.git'
        }
        stage("dockerVersion"){
            println "${GREEN_BOLD} STAGE: Dockerbuild ${RESET}"
            // sh("/usr/local/bin/docker version")
            sh("pwd")
            sh("ls -lha")
            sh("/usr/local/bin/docker build -t my-image:v1 ./docker/")
            sh("/usr/local/bin/docker images")
            sh("/usr/local/bin/docker run -d -p 9090:8090 my-image:v1")
            sh("/usr/local/bin/docker ps")
        }
    }
}

// import groovy.transform.Field

// @Field def RESET = '\u001B[0m'
// @Field def BLACK_BOLD = '\u001B[46m\u001B[1;30m' // skip stage msg
// @Field def RED_BOLD = '\u001B[1;31m' // error msg
// @Field def GREEN_BOLD = '\u001B[40m\u001B[1;32m' // stage name msg
// @Field def YELLOW_BOLD = '\u001B[1;33m'
// @Field def BLUE_BOLD = '\u001B[1;34m'
// @Field def CYAN_BOLD = '\u001B[1;36m'
// @Field def PURPLE_BOLD = '\u001B[1;35m' // info msg
// @Field def WHITE_BOLD = '\u001B[1;37m'

// ansiColor('xterm') {
//     properties([parameters([string(defaultValue:"hello", description:"What's happening",name:'Greetings')])])
//     node{
//         stage("Kubectl version"){
//             println "${GREEN_BOLD} STAGE: VersionList ${RESET}"
//             withEnv(["PATHI=test/bin"]){
//                 println "${env.PATHI}"
//             }
//             println "${params.Greetings}"
//             sh("echo ls")
//             sh("/usr/local/bin/kubectl version")
//         }
//         stage("Cluster information"){
//             println "${GREEN_BOLD} STAGE: PODS info ${RESET}"
//             sh("/usr/local/bin/kubectl get pods -n glass")
//         }
//         stage("List deployments"){
//             println "${GREEN_BOLD} STAGE: Deploy info ${RESET}"
//             sh("/usr/local/bin/kubectl get deploy -n glass")
//         }
//     }

//     node{
//         stage("Kubectl version"){
//             println "${GREEN_BOLD} STAGE: VersionList ${RESET}"
//             sh("echo ls")
//             sh("/usr/local/bin/kubectl version")
//         }
//         stage("Cluster information"){
//             println "${GREEN_BOLD} STAGE: PODS info ${RESET}"
//             sh("/usr/local/bin/kubectl get pods -n glass")
//         }
//         stage("List deployments"){
//             println "${GREEN_BOLD} STAGE: Deploy info ${RESET}"
//             sh("/usr/local/bin/kubectl get deploy -n glass")
//         }
//     }
// 
