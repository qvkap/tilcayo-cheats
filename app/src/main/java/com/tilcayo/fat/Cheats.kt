package com.tilcayo.fat

/**
 * Читы (только для этого форка). Флаги хранятся в SaveData, а сюда копируются при запуске,
 * чтобы Sim мог их читать без Android. По умолчанию всё выключено — юнит-тесты не затронуты.
 */
object Cheats {
    const val GOD = 1
    const val NO_LAVA = 2
    const val INF_JUMPS = 4
    const val COIN_X10 = 8
    const val ONE_HIT = 16

    @JvmField var flags = 0

    fun has(f: Int) = flags and f != 0

    class Def(val id: Int, val emoji: String, val name: String, val desc: String)

    val all = listOf(
        Def(GOD, "🛡", "Бессмертие", "ничто не убивает: шипы, пилы, лазеры, босс, лава"),
        Def(NO_LAVA, "🧊", "Без лавы", "лава не поднимается, падать вниз не страшно"),
        Def(INF_JUMPS, "⏫", "Бесконечные рывки", "рывков в воздухе сколько угодно"),
        Def(COIN_X10, "💰", "Монеты x10", "в десять раз больше монет за обычный забег"),
        Def(ONE_HIT, "🐰", "Босс с одного удара", "любое попадание сразу побеждает босса"),
    )
}
