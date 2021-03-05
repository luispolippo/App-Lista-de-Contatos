package com.polippo.listadecontatos.singleton

import com.polippo.listadecontatos.feature.listacontatos.model.ContatosVO

object ContatoSingleton {
        var lista: MutableList<ContatosVO> = mutableListOf()
}