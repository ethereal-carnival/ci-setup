buildMonitorView('Wall') {
    jobs {
        regex('.*')
    }
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