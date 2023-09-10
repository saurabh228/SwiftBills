package app.swiftbills.data.home

import app.swiftbills.data.Resource
import app.swiftbills.data.models.Dashboard

interface DashboardRepository {
    suspend fun getDashboardInfo(): Resource<Dashboard>
}