package ai.estsoft.rounz_vf_android.external.model

class Profile(
    val type: Type,
    val name: String,
    val path: String,
    val thumbnail: String,
    val isCurrentProfile: Boolean
) {
    companion object {
        val EMPTY = Profile(Type.Unknown, "", "", "", false)
    }

    enum class Type {
        FifteenCut, OneCut, Unknown // 순서 변경 금지
    }
}