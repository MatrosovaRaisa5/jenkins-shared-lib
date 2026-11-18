def call(Map config = [:]) {
    // Извлекаем значения из Map, задаем значения по умолчанию, если их нет
    def message = config.get('message', 'No message provided')
    def channel = config.get('channel', '#general')
    
    echo "📢 [SLACK MOCK] Sending to channel [${channel}]: ${message}"
