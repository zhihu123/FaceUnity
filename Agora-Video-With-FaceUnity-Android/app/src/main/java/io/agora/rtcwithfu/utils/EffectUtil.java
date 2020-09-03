package io.agora.rtcwithfu.utils;

import io.agora.rtcwithfu.Effect;

public class EffectUtil {
     public static Effect EFFECT_NONE = new Effect(
             "none", 0, "", 1,
             Effect.EFFECT_TYPE_NONE, 0);

     public static Effect EFFECT_DEFAULT = new Effect(
             "sdlu", 0, "effect/normal/sdlu.bundle",
             4, Effect.EFFECT_TYPE_STICKER, 0);
}