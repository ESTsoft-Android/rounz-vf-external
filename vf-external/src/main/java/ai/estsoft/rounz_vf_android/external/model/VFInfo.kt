package ai.estsoft.rounz_vf_android.external.model

data class VFInfo(
    val productId: Int,
    val profileName: String,
    val vfResourceUrl: String
) {
    val profilePath: String
        get() = "0_user_profile/${profileName}"

    companion object {
        val EMPTY = VFInfo(0, "", "")
    }
}