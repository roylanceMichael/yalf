package org.roylance.yalf.services

import org.roylance.yalf.YalfModel

interface ITransition {
    fun perform(state: YalfModel.State): YalfModel.Transition
}