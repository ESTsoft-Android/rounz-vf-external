package ai.estsoft.rounz_vf_android.external.model

data class VFInfo(
    val productId: String = "",                                 // 상품 번호
    val productOptionId: String = "",                           // 상품 옵션 번호
    val profileName: String = "",                               // 피팅할 프로필의 이름
    val profileType: Profile.Type = Profile.Type.Unknown,       // 피팅할 프로필의 타입
    val vfResourceId: String = "",                              // VF를 적용할 리소스 ID
    val vfResourceUrl: String = ""                              // VF를 적용할 리소스 URL
) {
    val profilePath: String                                     // 피팅할 프로필의 경로
        get() = "0_user_profile/${profileName}"

    companion object {
        val EMPTY = VFInfo()
    }
}