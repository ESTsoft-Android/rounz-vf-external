package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.model.FaceSize
import ai.estsoft.rounz_vf_android.external.model.Gender
import ai.estsoft.rounz_vf_android.external.model.Profile

interface Profile {
    /**
     * 생성된 모든 프로필을 가져옵니다.
     *
     * @return 프로필 리스트
     */
    fun getProfiles(): List<Profile>

    /**
     * 전달받은 프로필 리스트를 제거하고, 남은 프로필 리스트를 반환합니다.
     *
     * @param profiles 제거할 프로필 리스트
     * @return 제거 후 남은 프로필 리스트
     */
    fun removeProfiles(profiles: List<Profile>): List<Profile>

    /**
     * 현재 프로필 정보를 가져옵니다.
     *
     * @return 현재 프로필
     */
    fun getCurrentProfile(): Profile

    /**
     * 현재 프로필 정보를 변경합니다.
     *
     * @param profile 변경할 프로필
     */
    fun updateCurrentProfile(profile: Profile)

    /**
     * 가장 최근에 생성된 프로필을 가져옵니다.
     *
     * @return 가장 최근에 생성된 프로필
     */
    fun getRecentlyCreatedProfile(): Profile

    /**
     * 저장된 프로필의 타입을 가져옵니다.
     *
     * @param profileName 프로필 이름
     * @return [Profile.Type] 프로필 타입
     */
    fun getProfileType(profileName: String): Profile.Type

    /**
     * 저장된 프로필의 성별을 가져옵니다.
     *
     * @param profileName 프로필 이름
     * @return [Gender] 성별
     */
    fun getProfileGender(profileName: String): Gender

    /**
     * 저장된 프로필의 얼굴 크기를 가져옵니다.
     *
     * @param profileName 프로필 이름
     * @return [FaceSize] 얼굴 크기
     */
    fun getProfileFaceSize(profileName: String): FaceSize

    /**
     * 프로필 설정파일을 업데이트 합니다.
     *
     * @param profileName 프로필 이름
     * @param gender 프로필 성별
     * @param faceSize 프로필 얼굴 크기
     */
    fun updateFaceInfo(
        profileName: String,
        gender: Gender,
        faceSize: FaceSize
    )
}