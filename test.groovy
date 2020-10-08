// def x

// x=new java.util.Date()
// println x

// def (a,b,c) = [10,20,40]
// // assert a == 10 && b == 20 && c == 50
// def l = [1,2,4]
// println l
// def (_,mon,year) = "18th July 1989".split()
// assert "In $mon of $year" == "In July of 1989 "

// def x = true
// def y = true
// if(x){
//     x=false
// }else{
//     y = true
// }
// // assert x==y

// for(def i in 0..9){
//     println i
// }
// def name = "    nmae"
// println "${name}"

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
    node{
        stage("jenkins Variables"){
            println "${GREEN_BOLD} STAGE: jenkins variables ${RESET}"
            println "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            withEnv(["PATH+MAVEN=test/bin"]){
                println "${env.PATHI+MAVEN}"
            }
            
            echo "url: $JENKINS_URL"
            echo "node name: $NODE_NAME"
            echo "job_name: $JOB_NAME "
            echo "build id: $BUILD_ID"
            echo "job url: $JOB_URL"
            echo "build url: $BUILD_URL"
            echo "workspace: $WORKSPACE"
        }
        stage("Kubectl version"){
            println "${GREEN_BOLD} STAGE: VersionList ${RESET}"
            sh("echo ls")
            sh("/usr/local/bin/kubectl version")
        }
        // stage("Cluster information"){
        //     println "${GREEN_BOLD} STAGE: PODS info ${RESET}"
        //     sh("/usr/local/bin/kubectl get pods -n glass")
        // }
        // stage("List deployments"){
        //     println "${GREEN_BOLD} STAGE: Deploy info ${RESET}"
        //     sh("/usr/local/bin/kubectl get deploy -n glass")
        // }
    }

    // node{
    //     stage("Kubectl version"){
            
    //             println "${GREEN_BOLD} STAGE: VersionList ${RESET}"    
            
            
    //             sh("echo ls")
            
            
    //             sh("/usr/local/bin/kubectl version")
                        
    //     }
    //     stage("Cluster information"){
    //         println "${GREEN_BOLD} STAGE: PODS info ${RESET}"
    //         sh("/usr/local/bin/kubectl get pods -n glass")
    //     }
    //     stage("List deployments"){
    //         println "${GREEN_BOLD} STAGE: Deploy info ${RESET}"
    //         sh("/usr/local/bin/kubectl get deploy -n glass")
    //     }
    // }
}