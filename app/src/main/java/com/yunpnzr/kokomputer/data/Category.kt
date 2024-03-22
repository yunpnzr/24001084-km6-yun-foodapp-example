package com.yunpnzr.kokomputer.data

import java.util.UUID

data class Category (
    var id: String = UUID.randomUUID().toString(),
    var name: String,
    var imgUrl: String
)