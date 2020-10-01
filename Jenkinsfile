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
node{
    stage("Kubectl version"){
        sh("echo ls")
        sh("/usr/local/bin/kubectl version")
    }
    stage("Cluster information"){
        sh("/usr/local/bin/kubectl cluster-info")
    }
    stage("List deployments"){
        sh("/usr/local/bin/kubectl get deploy")
    }
}