package com.yunpnzr.kokomputer.data

import java.util.UUID

data class Catalog(
    var id: String = UUID.randomUUID().toString(),
    var name: String,
    var imgUrl: String,
    var price: Double,
    var desc: String,
    var rating: Double,
)
