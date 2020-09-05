buildMonitorView('Wall') {
    jobs {
        regex('.*')
    }
    recurse(true)
}

listView('List') {
    description('All jobs')
    filterBuildQueue()
    filterExecutors()
    jobs {
        regex('.*')
    }
    recurse(true)
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}