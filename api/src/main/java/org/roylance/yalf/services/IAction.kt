package org.roylance.yalf.services

import org.roylance.yalf.YalfModel

interface IAction {
    fun perform(state: YalfModel.State): YalfModel.State
}