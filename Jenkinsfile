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
    stage("Build"){
        sh("echo ls")
        sh("/usr/local/bin/kubectl version")
    }
    stage("Test"){
        sh("pwd")
    }
    stage("Deploy"){
        sh("echo welcome")
    }
}