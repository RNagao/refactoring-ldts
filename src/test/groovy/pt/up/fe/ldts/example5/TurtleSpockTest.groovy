package pt.up.fe.ldts.example5

import spock.lang.Specification

class TurtleSpockTest extends Specification {

    def 'Rotate Left'() {
        given:
            def turtleN = new TurtleNorth()
            def turtle = new Turtle(5, 5, turtleN)

        when:
            turtle.execute('L' as char)

        then:
            'W' == turtle.getDirection()

        and:
            turtle.execute('L' as char)

        then:
            'S' == turtle.getDirection()

        and:
            turtle.execute('L' as char)

        then:
            'E' == turtle.getDirection()

        and:
            turtle.execute('L' as char)

        then:
            'N' == turtle.getDirection()

        and:
            5 == turtle.getRow()
            5 == turtle.getColumn()
    }

    def 'Rotate Right'() {
        given:
            def turtleN = new TurtleNorth()
            def turtle = new Turtle(5, 5, turtleN)

        when:
            turtle.execute('R' as char)

        then:
            'E' == turtle.getDirection()

        and:
            turtle.execute('R' as char)

        then:
            'S' == turtle.getDirection()

        and:
            turtle.execute('R' as char)

        then:
            'W' == turtle.getDirection()

        and:
            turtle.execute('R' as char)

        then:
            'N' == turtle.getDirection()

        and:
            5 == turtle.getRow()
            5 == turtle.getColumn()
    }

    def 'Forward'() {
        given:
            def turtleNorth = new TurtleNorth()
            def turtleWeast = new TurtleWeast()
            def turtleSouth = new TurtleSouth()
            def turtleEast = new TurtleEast()
            def turtleN = new Turtle(5, 5, turtleNorth)
            def turtleW = new Turtle(5, 5, turtleWeast)
            def turtleS = new Turtle(5, 5, turtleSouth)
            def turtleE = new Turtle(5, 5, turtleEast)

        when:
            turtleN.execute('F' as char)
            turtleW.execute('F' as char)
            turtleS.execute('F' as char)
            turtleE.execute('F' as char)

        then:
            4 == turtleN.getRow()
            5 == turtleN.getColumn()

        and:
            5 == turtleW.getRow()
            4 == turtleW.getColumn()

        and:
            6 == turtleS.getRow()
            5 == turtleS.getColumn()

        and:
            5 == turtleE.getRow()
            6 == turtleE.getColumn()
    }
}
