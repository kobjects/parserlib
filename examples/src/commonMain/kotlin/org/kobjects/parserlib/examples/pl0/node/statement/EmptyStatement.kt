package org.kobjects.parserlib.examples.pl0.node.statement
import org.kobjects.parserlib.examples.pl0.runtime.EvaluationContext

class EmptyStatement() : Statement() {
    override fun eval(context: EvaluationContext) {
    }

    override fun toString(indent: String) = ""
}