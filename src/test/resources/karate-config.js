function fn() {
    var env = karate.env; // get java system property 'karate.env'
    karate.log('configuring global karate...');
    karate.log('karate.env system property was:', env);
    var protocol = 'http';
    var port = karate.properties['demo.server.port'];
    if (!port) {
        port = 9111;
    }
    if (karate.properties['demo.server.https'] == 'true') {
        protocol = 'https';
        karate.configure('ssl', true);
    }
    if (!env) {
        env = 'dev'; // a custom 'intelligent' default
    }
    var config = { // base config JSON
        appId: 'my.app.id',
        appSecret: 'my.secret',
        someUrlBase: 'https://some-host.com/v1/auth/',
        anotherUrlBase: 'https://another-host.com/v1/',
        demoUrlBase: null,
        env: env
    };
    if (env == 'stage') {
        // over-ride only those that need to be
        config.someUrlBase = 'https://stage-host/v1/auth';
    } else if (env == 'e2e') {
        config.someUrlBase = 'https://e2e-host/v1/auth';
    } else if (env == 'mock') {
        config.demoUrlBase = protocol + '://127.0.0.1:' + port;
    }
    // don't waste time waiting for a connection or if servers don't respond within 5 seconds
    karate.configure('connectTimeout', 5000);
    karate.configure('readTimeout', 5000);
    karate.configure('ssl', true);
    karate.configure('ssl', {trustAll: true});
    karate.configure('report', true);
    karate.configure('report', {showLog: true, showAllSteps: true});
    return config;
}