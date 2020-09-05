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
    jobFilters {
        all()
    }
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