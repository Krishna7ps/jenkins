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
    stage("Check Version"){
        sh("kubectl version ")
    }
    stage("Check cluster info"){
        sh("kubectl cluster-info")
    }
    stage("List deploys"){
        sh("kubectl get deploy")
    }
}