package ai.estsoft.rounz_vf_android.external.interfaces

import android.graphics.Rect
import android.util.Size

interface FaceDetectingRender {
    /**
     * 모듈 안에서 가이드라인 영역을 계산하기 위해 값을 넘겨받는 함수입니다.
     *
     * @param cameraSize 카메라 화면의 사이즈
     * @param guideLineRect 가이드라인의 사이즈
     */
    fun onUiLayoutChanged(cameraSize: Size, guideLineRect: Rect)

    /**
     * Texture 의 크기를 알기 위해 값을 넘겨받는 함수입니다.
     *
     * @param width Texture 의 가로 크기
     * @param height Texture 의 세로 크기
     */
    fun onSurfaceChanged(width: Int, height: Int)

    /**
     * Texture 를 넘겨받기 위한 함수 입니다.
     *
     * @param textureId 렌더링 중인, 카메라의 OpenGL Texture ID
     */
    fun onDrawFrame(textureId: Int)
}