package tasks

import groovy.transform.Canonical

/**
 * @Canonical该注解默认实现了一些通用方法(例如equals和hashcode等)
 */
@Canonical
class GroovyTask {
    String name
    int priority
    Date startDate
    Date endDate
}
