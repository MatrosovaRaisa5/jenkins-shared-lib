def call(String message, String channel = '#general') {
    withCredentials([string(credentialsId: 'slack-webhook', variable: 'SLACK_WEBHOOK')]) {
        sh """
            curl -X POST -H 'Content-type: application/json' \\
                 --data '{"text": "${message}", "channel": "${channel}"}' \\
                 $SLACK_WEBHOOK
        """
    }
}
