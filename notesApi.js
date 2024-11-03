class NotesAPI {
    // Fetch existing notes from the API
    async getNotes() {
        const response = await fetch("/api/v2/notes");
        const notes = await response.json();
        return notes;
    }

    // Add a new note to the API
    async addNote(note) {
        return await fetch("/api/v2/notes", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(note),
        });
    }

    // Remove a note from the API
    async removeNote(noteId) {
        return await fetch("/api/v1/notes", {
            method: 'DELETE',
        });
    }
}