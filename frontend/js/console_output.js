const logOutput = document.getElementById('log-output');

// Store the original console.log function
const originalConsoleLog = console.log;

// Override console.log to capture messages
console.log = function(message) {
    // Comment out or remove the original console.log call
    // originalConsoleLog.apply(console, arguments);

    // Append the message to the log output textarea
    if (message !== 'CheerpJ runtime ready') {
        logOutput.value += message + '\n'; // Ensure to add a newline character
    }

    // Optionally, scroll to the bottom of the textarea to show the latest logs
    logOutput.scrollTop = logOutput.scrollHeight;
};