def call(Map config = [:]) {
    def image = config.get('image', 'my-app')
    def tag = config.get('tag', 'latest')
    def dockerfile = config.get('dockerfile', 'Dockerfile')

    echo "Building Docker image: ${image}:${tag}"
    sh "docker build -f ${dockerfile} -t ${image}:${tag} -t ${image}:latest ."
    echo "Build complete."
}
