package gl51.service.impl

import gl51.data.Picture
import gl51.service.PictureWatermarkService

import javax.inject.Singleton

@Singleton
class PictureWatermarkServiceImpl implements PictureWaterService {
    Picture watermark(Picture p){
        return p
    }
}