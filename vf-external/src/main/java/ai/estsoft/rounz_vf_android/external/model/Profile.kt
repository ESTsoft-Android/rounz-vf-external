package ai.estsoft.rounz_vf_android.external.model

data class Profile(
    val type: Type,                         // 프로필 타입
    val name: String,                       // 프로필 이름
    val path: String,                       // 프로필 파일 경로
    val thumbnail: String,                  // 대표 썸네일 파일 경로
    val isCurrentProfile: Boolean           // 현재 프로필인지에 대한 여부
) {
    companion object {
        val EMPTY = Profile(Type.Unknown, "", "", "", false)
    }

    enum class Type {
        FifteenCut, OneCut, Unknown // 순서 변경 금지
    }
}