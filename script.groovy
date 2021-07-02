def pushApp() {
    echo 'Subindo a imagem no docker hub'
    echo 'Menu de teste'
    sh 'docker push ${JOB_DISPLAY_URL}'
}

return this
