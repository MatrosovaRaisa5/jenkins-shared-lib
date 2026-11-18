package com.acme.ci

class Notifier implements Serializable {
    def script
    
    Notifier(script) { 
        this.script = script 
    }

    def log(String message) {
        script.echo "[NOTIFIER] ${message}"
    }
}
