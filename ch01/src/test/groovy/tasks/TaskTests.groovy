package tasks

import spock.lang.Specification

/**
 * 检验@Canonical注解实现的方法与自己重写方法是否相同
 */
class TaskTests extends Specification{
    JavaTask javaTask1 = new JavaTask(name:'name',priority: 1,startDate: new Date(),endDate: new Date()+1)
    JavaTask javaTask2 = new JavaTask("jack",2,new Date(),new Date()+10)

    GroovyTask groovyTask1 = new GroovyTask(name:'name',priority: 1,startDate: new Date(),endDate: new Date()+1)
    GroovyTask groovyTask2 = new GroovyTask("jack",2,new Date(),new Date()+10)

    def "groovy and java task are equivalent"(){
        expect:
        javaTask1.name == groovyTask1.name
        javaTask1.priority == groovyTask1.priority
        (javaTask1.startDate - groovyTask1.startDate).abs() < 1
        (javaTask1.endDate - groovyTask1.endDate).abs() < 1

        //expect:
        javaTask2.name == groovyTask2.name
        javaTask2.priority == groovyTask2.priority
        (javaTask2.startDate - groovyTask2.startDate).abs() < 1
        (javaTask2.endDate - groovyTask2.endDate).abs() < 1
    }

    def "groovy tasks have equals method"(){
        given:
        GroovyTask groovyCopy = new GroovyTask('name',1,groovyTask1.startDate,groovyTask1.endDate)
        GroovyTask groovyOther = new GroovyTask('name',2,new Date(),new Date()+1)

        expect:
        groovyTask1 == groovyCopy
        groovyTask1 != groovyOther
    }

    def "check hashCode and equals through Set"(){
        given:
        GroovyTask gTask1 = new GroovyTask('name',1,groovyTask1.startDate,groovyTask1.endDate)
        GroovyTask gTask2 = new GroovyTask('name',1,groovyTask1.startDate,groovyTask1.endDate)

        Set tasks = [groovyTask1,gTask1,gTask2]

        expect:
        tasks.size() == 1
    }
}
