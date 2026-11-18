def call(Map config = [:]) {
    def message = config.get('message', 'No message provided')
    def channel = config.get('channel', '#general')
    
    echo "📢 [SLACK MOCK] Sending to channel [${channel}]: ${message}"
}
