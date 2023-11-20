<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
Use \App\Models\Event;
use Carbon\Carbon;

class EventSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        Event::factory()->create([
            'title' => 'II Tech I Week',
            'description' => 'Essa é uma descricao do evento.',
            'initial_date' => Carbon::create(2023, 8, 16),
            'final_date' => Carbon::create(2023, 8, 22),
        ]);
    }
}
