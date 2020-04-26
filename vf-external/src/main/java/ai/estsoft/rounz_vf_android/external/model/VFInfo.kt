package ai.estsoft.rounz_vf_android.external.model

data class VFInfo(
    val productId: Int,                     // 상품 번호
    val profileName: String,                // 피팅할 프로필의 이름
    val vfResourceUrl: String               // VF를 적용할 리소스 URL
) {
    val profilePath: String                 // 피팅할 프로필의 경로
        get() = "0_user_profile/${profileName}"

    companion object {
        val EMPTY = VFInfo(0, "", "")
    }
}