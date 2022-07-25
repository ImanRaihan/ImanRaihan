package com.imanraihan.playground10

class Gym(val personal: String) {

    private var weight: Int = 0
    val name: String = ""
    val maxWeight: Int = 500
    var maxAge: Int = 50

    private val _gymList = mutableListOf<String>()
    val gymList: List<String>
        get() = _gymList

    fun updateWeightAndAge(weight: Int, maxAge: Int) {
        this.weight = 0
        this.maxAge = maxAge
    }

    fun updateGymList() {
        this._gymList.clear()
        this._gymList.addAll(gymList)
    }

    companion object {
        const val MIN_WEIGHT = 50
        const val MIN_AGE = 15
    }
}
