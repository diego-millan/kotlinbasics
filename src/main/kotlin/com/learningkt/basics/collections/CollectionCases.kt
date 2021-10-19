package com.learningkt.basics.collections

import com.learningkt.basics.collections.domain.GenderEnum
import com.learningkt.basics.collections.domain.Hero
import kotlin.math.min

class CollectionCases {

    private val heroes = listOf(
        Hero("The Captain", 60, GenderEnum.MALE),
        Hero("Frenchy", 42, GenderEnum.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, GenderEnum.FEMALE),
        Hero("First Mate", 29, GenderEnum.MALE),
        Hero("Sir Stephen", 37, GenderEnum.MALE)
    )
    fun getLast() : String {

        return heroes.last().name
    }

    fun mapByDistinctAge() : Int {
        return heroes.map { it.age }.distinct().size
    }

    fun filterByAge(minAge : Int) : Int {
        return heroes.filter { it.age < minAge }.size
    }

    fun partitionByAge(minAge : Int) : Pair<Int, Int> {

        val(youngest, oldest) = heroes.partition { it.age < minAge }

        return Pair (youngest.size, oldest.size)
    }

    fun maxByName() : String? {
        return heroes.maxByOrNull { it.age > 30 }?.name
    }

    fun validateAllAges(age : Int) : Boolean {
        return heroes.all { it.age > age }
    }

    fun checkAnyGender(gender : GenderEnum) : Boolean {
        return heroes.any {gender == it.gender}
    }

    fun groupByAge() : Pair<Int, List<Hero>> {
        val mapByAge: Map<Int, List<Hero>> = heroes.groupBy { it.age }

        val selector: (Map.Entry<Int, List<Hero>>) -> Int = { (_, group) ->
            group.size
        }

        val (age, group) = mapByAge.maxByOrNull(selector)!!

        return Pair(age, group)
    }

    fun associateByName(name : String?) : Hero? {
        val mapByName : Map<String, Hero> =
            heroes.associateBy { it.name }

        return mapByName[name]

        //val unknownHero = Hero("Unknown", 0, null)
        //mapByName.getOrElse("unknown") { unknownHero }.age
    }

    fun List<Int>.allNonZero() = this.all  { it -> it != 0 }
    fun List<Int>.allNonZero1() =  this.none { it -> it == 0 }
    fun List<Int>.allNonZero2() =  !this.any { it -> it == 0 }

    fun List<Int>.containsZero() =  this.any { it -> it == 0 }
    fun List<Int>.containsZero1() =  !this.all { it -> it != 0 }
    fun List<Int>.containsZero2() = !this.none { it -> it == 0 }
}